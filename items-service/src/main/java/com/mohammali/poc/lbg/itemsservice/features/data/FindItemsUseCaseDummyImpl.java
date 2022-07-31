package com.mohammali.poc.lbg.itemsservice.features.data;

import com.mohammali.poc.lbg.itemsservice.features.models.ItemEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class FindItemsUseCaseDummyImpl implements FindItemsUseCase {

    private final List<ItemEntity> items = new ArrayList<>();

    public FindItemsUseCaseDummyImpl() {
        items.add(new ItemEntity(1, "item 1"));
        items.add(new ItemEntity(2, "item 2"));
        items.add(new ItemEntity(3, "item 3"));
        items.add(new ItemEntity(4, "item 4"));
    }

    @Override
    public List<ItemEntity> find() {
        return items;
    }
}
