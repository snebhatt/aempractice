package com.adobe.aem.task.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
 
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AemPracticeModel {
 
    @Inject
    private String imagePath;
    
    @Inject
    private String isBackgroundImage;
 
    @Inject
    @Named("multifield")
    private List<NavigationItemsModel> navList;
 
    public String getImagePath() {
        return imagePath;
    }
    
    public Boolean isBackgroundImage() {
        return Boolean.valueOf(isBackgroundImage);
    }
 
    public List<NavigationItemsModel> getNavList() {
        return navList;
    }

}
