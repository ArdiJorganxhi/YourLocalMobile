package dev.ardijorganxhi.phoneapi.service;

import dev.ardijorganxhi.phoneapi.client.GsmArenaApiClient;
import dev.ardijorganxhi.phoneapi.entity.Phone;
import dev.ardijorganxhi.phoneapi.mapper.PhoneMapper;
import dev.ardijorganxhi.phoneapi.model.dto.PhoneDto;
import dev.ardijorganxhi.phoneapi.model.enums.PhoneBrand;
import dev.ardijorganxhi.phoneapi.model.response.PhoneResponse;
import dev.ardijorganxhi.phoneapi.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;
    private final GsmArenaApiClient gsmArenaApiClient;
    private final PhoneMapper phoneMapper;

    private PhoneResponse extractBrand(PhoneResponse responses) {

        int underScore = responses.getId().indexOf("_");
        responses.setId(responses.getId().substring(0, underScore));

        return responses;
    }

    private void saveApplePhones() {
        final List<PhoneResponse> phoneResponses = gsmArenaApiClient.getApplePhones();
        final List<PhoneResponse> phones = phoneResponses.stream().map(this::extractBrand).toList();

        for(PhoneResponse response: phones) {
            Phone phone = phoneMapper.convertToEntity(PhoneBrand.APPLE, response.getName());
            phoneRepository.save(phone);
        }
    }

    private void saveSamsungPhones() {
        final List<PhoneResponse> phoneResponses = gsmArenaApiClient.getSamsungPhones();
        final List<PhoneResponse> phones = phoneResponses.stream().map(this::extractBrand).toList();

        for(PhoneResponse response: phones) {
            Phone phone = phoneMapper.convertToEntity(PhoneBrand.SAMSUNG, response.getName());
            phoneRepository.save(phone);
        }
    }

    private void saveHuaweiPhones() {
        final List<PhoneResponse> phoneResponses = gsmArenaApiClient.getHuaweiPhones();
        final List<PhoneResponse> phones = phoneResponses.stream().map(this::extractBrand).toList();

        for(PhoneResponse response: phones) {
            Phone phone = phoneMapper.convertToEntity(PhoneBrand.HUAWEI, response.getName());
            phoneRepository.save(phone);
        }
    }

    private void saveXiaomiPhones() {
        final List<PhoneResponse> phoneResponses = gsmArenaApiClient.getXiaomiPhones();
        final List<PhoneResponse> phones = phoneResponses.stream().map(this::extractBrand).toList();

        for(PhoneResponse response: phones) {
            Phone phone = phoneMapper.convertToEntity(PhoneBrand.XIAOMI, response.getName());
            phoneRepository.save(phone);
        }
    }

    public void savePhones() {
        saveApplePhones();
        saveHuaweiPhones();
        saveSamsungPhones();
        saveXiaomiPhones();
    }

    public PhoneDto findById(Integer id) {
        final Phone phone = phoneRepository.findById(id).orElseThrow();
        return phoneMapper.convertToDto(phone);
    }

    public void deleteById(Integer id) {
        final Phone phone = phoneRepository.findById(id).orElseThrow();
        phone.setDeleted(true);
        phoneRepository.save(phone);
    }
}

