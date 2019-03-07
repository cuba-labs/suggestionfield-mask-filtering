package com.company.sample.web;

import com.haulmont.cuba.gui.screen.*;
import com.company.sample.entity.NameEntity;

@UiController("sample_NameEntity.browse")
@UiDescriptor("name-entity-browse.xml")
@LookupComponent("nameEntitiesTable")
@LoadDataBeforeShow
public class NameEntityBrowse extends StandardLookup<NameEntity> {
}