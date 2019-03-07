package com.company.sample.web;

import com.haulmont.cuba.gui.screen.*;
import com.company.sample.entity.NameEntity;

@UiController("sample_NameEntity.edit")
@UiDescriptor("name-entity-edit.xml")
@EditedEntityContainer("nameEntityDc")
@LoadDataBeforeShow
public class NameEntityEdit extends StandardEditor<NameEntity> {
}