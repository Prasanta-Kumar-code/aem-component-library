package com.prasanta.aemcomponentlibrary.core.models;

import java.util.Collections;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardGridModel {

    @ChildResource(name = "cards")
    private List<CardItem> cards;

    @ValueMapValue
    private String columns;

    public List<CardItem> getCards() {
        return cards == null ? Collections.emptyList() : cards;
    }

    public String getGridClass() {
        if ("two".equals(columns) || "four".equals(columns)) {
            return "card-grid--" + columns;
        }
        return "card-grid--three";
    }
}