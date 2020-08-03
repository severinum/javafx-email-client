package com.severinu.controller;

import com.severinu.EmailManager;
import com.severinu.view.ColorTheme;
import com.severinu.view.FontSize;
import com.severinu.view.ViewFactory;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class OptionsWindowController extends BaseController implements Initializable {

    @FXML
    private Slider sliderFontSize;

    @FXML
    private ChoiceBox<ColorTheme> choiceBoXTheme;

    @FXML
    private Button btnApplyOptions;

    @FXML
    private Button btnCancelOptions;

    public OptionsWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void applyBtnAction() {
        viewFactory.setColorTheme(choiceBoXTheme.getValue());
        viewFactory.setFontSize(FontSize.values()[(int) (sliderFontSize.getValue())]);
        viewFactory.updateStyles();
    }

    @FXML
    void cancelBtnAction() {
        Stage stage = (Stage) sliderFontSize.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setUpThemePicker();
        setUpFontSizePicker();
    }

    private void setUpFontSizePicker() {
        sliderFontSize.setMin(0);
        sliderFontSize.setMax(FontSize.values().length - 1);
        sliderFontSize.setValue(viewFactory.getFontSize().ordinal());
        sliderFontSize.setMajorTickUnit(1);
        sliderFontSize.setMinorTickCount(0);
        sliderFontSize.setBlockIncrement(1);
        sliderFontSize.setSnapToTicks(true);
        sliderFontSize.setShowTickLabels(true);
        sliderFontSize.setShowTickLabels(true);
        sliderFontSize.setLabelFormatter(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                int i = object.intValue();
                return FontSize.values()[i].toString();
            }

            @Override
            public Double fromString(String s) {
                return null;
            }
        });
        sliderFontSize.valueProperty().addListener((obs, oldVal, newVal)->{
            sliderFontSize.setValue(newVal.intValue());
        } );
    }

    private void setUpThemePicker() {
        choiceBoXTheme.setItems(FXCollections.observableArrayList(ColorTheme.values()));
        choiceBoXTheme.setValue(viewFactory.getColorTheme());
    }
}
