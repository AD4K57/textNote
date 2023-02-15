package com.mao.textNote.service;

import com.mao.textNote.entity.TextEntity;
import com.mao.textNote.model.TextDTO;
import com.mao.textNote.model.exception.NotFoundException;
import com.mao.textNote.service.repo.TextRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TextServiceImpl implements TextService {

    private final TextRepository textRepository;

    @Override
    public String save(TextDTO textDTO) {
        textRepository.save(TextEntity.builder()
                .userName(textDTO.getUserName())
                .text(textDTO.getText())
                .build());

        return "save succesfully";
    }

    @Override
    public List<TextEntity> getAll() {
        return textRepository.findAll();
    }

    //todo: add detail in exception
    @Override
    @SneakyThrows
    public TextDTO update(TextDTO textDTO, Long id) {
        TextEntity textEntity = checkTxt(id);
        textEntity.setText(textDTO.getText());
        textEntity.setUserName(textDTO.getUserName());
        textEntity = textRepository.save(textEntity);
        return TextDTO.builder()
                .userName(textEntity.getUserName())
                .text(textEntity.getText())
                .build();
    }

    //todo: add exception
    @SneakyThrows
    @Override
    public String delete(Long id) {
        checkTxt(id);
        textRepository.deleteById(id);
        return id.toString();
    }

    @SneakyThrows
    private TextEntity checkTxt(Long id) {
        return textRepository.findById(id).orElseThrow(() -> new NotFoundException(500, "Not found Entity with given Id"));
    }

}
