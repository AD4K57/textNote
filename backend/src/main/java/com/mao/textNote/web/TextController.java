package com.mao.textNote.web;

import com.mao.textNote.entity.TextEntity;
import com.mao.textNote.model.TextDTO;
import com.mao.textNote.service.TextService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/text")
@RequiredArgsConstructor
public class TextController {

    private final TextService textService;

    @PostMapping()
    public String saveText(@RequestBody TextDTO textDTO) {
        return textService.save(textDTO);
    }

    @GetMapping
    public List<TextEntity> getAll() {
        return textService.getAll();
    }

    @PutMapping("/{id}")
    public TextDTO update(@RequestBody TextDTO textDTO, @PathVariable Long id) {
        return textService.update(textDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deleteText(@PathVariable Long id) {
        return textService.delete(id);
    }
}
