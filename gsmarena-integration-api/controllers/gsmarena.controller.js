const gsmarena = require("gsmarena-api")



const getBrands = async function(req, res) {
    const brands = await gsmarena.catalog.getBrands();
    return res.status(200).send({brands})

}

const getApple = async function(req, res) {
    const brand = await gsmarena.catalog.getBrand('apple-phones-48');
    return res.status(200).send(brand)
}

const getSamsung = async function(req, res) {
    const brand = await gsmarena.catalog.getBrand('samsung-phones-9');
    return res.status(200).send(brand)
}

const getXiaomi = async function(req, res) {
    const brand = await gsmarena.catalog.getBrand('xiaomi-phones-80');
    return res.status(200).send(brand)
}

const getHuawei = async function(req, res) {
    const brand = await gsmarena.catalog.getBrand('huawei-phones-58')
    return res.status(200).send(brand)
}

module.exports = {getBrands, getApple, getSamsung, getXiaomi, getHuawei}