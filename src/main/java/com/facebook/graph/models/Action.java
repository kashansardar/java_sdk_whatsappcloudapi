/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Action type.
 */
public class Action {
    private String button;
    private List<Button> buttons;
    private List<Section> sections;

    /**
     * Default constructor.
     */
    public Action() {
    }

    /**
     * Initialization constructor.
     * @param  button  String value for button.
     * @param  buttons  List of Button value for buttons.
     * @param  sections  List of Section value for sections.
     */
    public Action(
            String button,
            List<Button> buttons,
            List<Section> sections) {
        this.button = button;
        this.buttons = buttons;
        this.sections = sections;
    }

    /**
     * Getter for Button.
     * Required for List Messages. Button content. It cannot be an empty string and must be unique
     * within the message. Emojis are supported, markdown is not.
     * @return Returns the String
     */
    @JsonGetter("button")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getButton() {
        return button;
    }

    /**
     * Setter for Button.
     * Required for List Messages. Button content. It cannot be an empty string and must be unique
     * within the message. Emojis are supported, markdown is not.
     * @param button Value for String
     */
    @JsonSetter("button")
    public void setButton(String button) {
        this.button = button;
    }

    /**
     * Getter for Buttons.
     * Required for Reply Buttons. You can have up to 3 buttons. You cannot have leading or trailing
     * spaces when setting the ID.
     * @return Returns the List of Button
     */
    @JsonGetter("buttons")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Button> getButtons() {
        return buttons;
    }

    /**
     * Setter for Buttons.
     * Required for Reply Buttons. You can have up to 3 buttons. You cannot have leading or trailing
     * spaces when setting the ID.
     * @param buttons Value for List of Button
     */
    @JsonSetter("buttons")
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    /**
     * Getter for Sections.
     * Required for List Messages.
     * @return Returns the List of Section
     */
    @JsonGetter("sections")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Section> getSections() {
        return sections;
    }

    /**
     * Setter for Sections.
     * Required for List Messages.
     * @param sections Value for List of Section
     */
    @JsonSetter("sections")
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    /**
     * Converts this Action into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Action [" + "button=" + button + ", buttons=" + buttons + ", sections=" + sections
                + "]";
    }

    /**
     * Builds a new {@link Action.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Action.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .button(getButton())
                .buttons(getButtons())
                .sections(getSections());
        return builder;
    }

    /**
     * Class to build instances of {@link Action}.
     */
    public static class Builder {
        private String button;
        private List<Button> buttons;
        private List<Section> sections;



        /**
         * Setter for button.
         * @param  button  String value for button.
         * @return Builder
         */
        public Builder button(String button) {
            this.button = button;
            return this;
        }

        /**
         * Setter for buttons.
         * @param  buttons  List of Button value for buttons.
         * @return Builder
         */
        public Builder buttons(List<Button> buttons) {
            this.buttons = buttons;
            return this;
        }

        /**
         * Setter for sections.
         * @param  sections  List of Section value for sections.
         * @return Builder
         */
        public Builder sections(List<Section> sections) {
            this.sections = sections;
            return this;
        }

        /**
         * Builds a new {@link Action} object using the set fields.
         * @return {@link Action}
         */
        public Action build() {
            return new Action(button, buttons, sections);
        }
    }
}
