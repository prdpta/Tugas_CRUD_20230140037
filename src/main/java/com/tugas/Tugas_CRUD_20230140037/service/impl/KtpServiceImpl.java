package com.tugas.Tugas_CRUD_20230140037.service.impl;

import com.tugas.Tugas_CRUD_20230140037.dto.KtpDto;
import com.tugas.Tugas_CRUD_20230140037.entity.KtpEntity;
import com.tugas.Tugas_CRUD_20230140037.repository.KtpRepository;
import com.tugas.Tugas_CRUD_20230140037.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KtpServiceImpl implements KtpService {

    @Autowired
    private KtpRepository ktpRepository;

    @Override
    public KtpDto tambahKtp(KtpDto ktpDto) {
        if (ktpRepository.existsByNomorKtp(ktpDto.getNomorKtp())) {
            throw new RuntimeException("Nomor KTP sudah terdaftar!");
        }
        KtpEntity entity = new KtpEntity();
        mapToEntity(ktpDto, entity);
        KtpEntity saved = ktpRepository.save(entity);
        return mapToDto(saved);
    }

    @Override
    public List<KtpDto> ambilSemuaKtp() {
        return ktpRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public KtpDto ambilKtpById(Integer id) {
        KtpEntity entity = ktpRepository.findById(id).orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
        return mapToDto(entity);
    }

    @Override
    public KtpDto updateKtp(Integer id, KtpDto ktpDto) {
        KtpEntity entity = ktpRepository.findById(id).orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
        mapToEntity(ktpDto, entity);
        return mapToDto(ktpRepository.save(entity));
    }

    @Override
    public void hapusKtp(Integer id) {
        ktpRepository.deleteById(id);
    }

    private void mapToEntity(KtpDto dto, KtpEntity entity) {
        entity.setNomorKtp(dto.getNomorKtp());
        entity.setNamaLengkap(dto.getNamaLengkap());
        entity.setAlamat(dto.getAlamat());
        entity.setTanggalLahir(dto.getTanggalLahir());
        entity.setJenisKelamin(dto.getJenisKelamin());
    }

    private KtpDto mapToDto(KtpEntity entity) {
        KtpDto dto = new KtpDto();
        dto.setId(entity.getId());
        dto.setNomorKtp(entity.getNomorKtp());
        dto.setNamaLengkap(entity.getNamaLengkap());
        dto.setAlamat(entity.getAlamat());
        dto.setTanggalLahir(entity.getTanggalLahir());
        dto.setJenisKelamin(entity.getJenisKelamin());
        return dto;
    }
}