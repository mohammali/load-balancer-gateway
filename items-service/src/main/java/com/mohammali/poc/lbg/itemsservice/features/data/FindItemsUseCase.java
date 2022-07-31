package com.mohammali.poc.lbg.itemsservice.features.data;

import com.mohammali.poc.lbg.itemsservice.features.models.ItemEntity;

import java.util.List;

public interface FindItemsUseCase {

    List<ItemEntity> find();
}
