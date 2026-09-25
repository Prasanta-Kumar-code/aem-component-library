package com.prasanta.aemcomponentlibrary.core.models;

import java.util.Collections;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FaqModel {

    @ChildResource(name = "items")
    private List<FaqItem> items;

    @ValueMapValue
    private boolean searchEnabled;

    public List<FaqItem> getItems() {
        return items == null ? Collections.emptyList() : items;
    }

    public boolean isSearchEnabled() {
        return searchEnabled;
    }
}