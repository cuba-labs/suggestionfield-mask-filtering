package com.company.sample.web;

import com.company.sample.entity.NameEntity;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@UiController("sample_SampleScreen")
@UiDescriptor("sample-screen.xml")
@LoadDataBeforeShow
public class SampleScreen extends Screen {

    @Inject
    private CollectionContainer<NameEntity> names;

    @Install(to = "suggestionField", subject = "searchExecutor")
    private List suggestionFieldSearchExecutor(String query, Map<String, Object> params) {
        // consider a query with dot "." like regexp
        Pattern likeQuery = Pattern.compile(query);

        return names.getItems()
                .stream()
                .filter(item -> likeQuery.matcher(item.getName()).matches())
                .collect(Collectors.toList());
    }
}