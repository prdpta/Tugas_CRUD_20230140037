package com.tugas.Tugas_CRUD_20230140037.service;

import com.tugas.Tugas_CRUD_20230140037.dto.KtpDto;
import java.util.List;

public interface KtpService {
    KtpDto tambahKtp(KtpDto ktpDto);
    List<KtpDto> ambilSemuaKtp();
    KtpDto ambilKtpById(Integer id);
    KtpDto updateKtp(Integer id, KtpDto ktpDto);
    void hapusKtp(Integer id);
}