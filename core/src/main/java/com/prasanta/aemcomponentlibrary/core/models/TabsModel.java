package com.prasanta.aemcomponentlibrary.core.models;

import java.util.Collections;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TabsModel {

    @ChildResource(name = "items")
    private List<TabItem> items;

    @ValueMapValue
    private Integer activeTab;

    public List<TabItem> getItems() {
        return items == null ? Collections.emptyList() : items;
    }

    public int getActiveTab() {
        int selectedTab = activeTab == null ? 0 : activeTab;
        return Math.max(0, selectedTab);
    }
}