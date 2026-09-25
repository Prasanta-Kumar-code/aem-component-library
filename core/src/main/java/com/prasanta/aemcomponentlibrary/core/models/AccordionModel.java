package com.prasanta.aemcomponentlibrary.core.models;

import java.util.Collections;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AccordionModel {

    @ChildResource(name = "items")
    private List<AccordionItem> items;

    public List<AccordionItem> getItems() {
        return items == null ? Collections.emptyList() : items;
    }
}