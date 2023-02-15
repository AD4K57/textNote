package com.mao.textNote.service;

import com.mao.textNote.entity.TextEntity;
import com.mao.textNote.model.TextDTO;

import java.util.List;

public interface TextService {
    String save(TextDTO textDTO);

    TextDTO update(TextDTO textDTO, Long id);

    String delete(Long id);

    List<TextEntity> getAll();
}
