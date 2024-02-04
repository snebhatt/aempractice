package com.adobe.aem.task.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NavigationItemsModel {

	@Inject
	private String itemTitle;

	@Inject
	private String itemPath;

	public String getItemTitle() {
		return itemTitle;
	}

	public String getItemPath() {
		return itemPath;
	}

}
