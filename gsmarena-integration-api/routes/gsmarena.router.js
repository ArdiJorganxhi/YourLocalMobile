const router = require("express").Router();

const { getBrands, getApple, getHuawei, getSamsung, getXiaomi } = require("../controllers/gsmarena.controller.js")


router.get("/brands", getBrands)
router.get("/apple", getApple)
router.get("/huawei", getHuawei)
router.get("/samsung", getSamsung)
router.get("/xiaomi", getXiaomi)

module.exports = router