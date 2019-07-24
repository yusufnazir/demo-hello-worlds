package com.vaadin.flow.demo.helloworld;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("main-page")
@HtmlImport("frontend://src/MainPage.html")
@PageTitle("mainpage")
@Route(value = "mainpage", layout = MainLayout.class)
public class MainPage extends PolymerTemplate<TemplateModel> {

}
