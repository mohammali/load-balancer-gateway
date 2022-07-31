package com.mohammali.poc.lbg.itemsservice.features.web.controller;

import com.mohammali.poc.lbg.itemsservice.features.data.FindItemsUseCase;
import com.mohammali.poc.lbg.itemsservice.features.models.ItemEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("items")
@RequiredArgsConstructor
public class ItemsController {

    private final FindItemsUseCase findItemsUseCase;

    @GetMapping
    public List<ItemEntity> findAll() {
        System.out.println("here");
        return findItemsUseCase.find();
    }
}
