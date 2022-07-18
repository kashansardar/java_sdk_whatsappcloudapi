/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Name type.
 */
public class Name {
    private String formattedName;
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private String prefix;

    /**
     * Default constructor.
     */
    public Name() {
    }

    /**
     * Initialization constructor.
     * @param  formattedName  String value for formattedName.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  middleName  String value for middleName.
     * @param  suffix  String value for suffix.
     * @param  prefix  String value for prefix.
     */
    public Name(
            String formattedName,
            String firstName,
            String lastName,
            String middleName,
            String suffix,
            String prefix) {
        this.formattedName = formattedName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = suffix;
        this.prefix = prefix;
    }

    /**
     * Getter for FormattedName.
     * Full name, as it normally appears.
     * @return Returns the String
     */
    @JsonGetter("formatted_name")
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * Setter for FormattedName.
     * Full name, as it normally appears.
     * @param formattedName Value for String
     */
    @JsonSetter("formatted_name")
    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }

    /**
     * Getter for FirstName.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for MiddleName.
     * @return Returns the String
     */
    @JsonGetter("middle_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Setter for MiddleName.
     * @param middleName Value for String
     */
    @JsonSetter("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Getter for Suffix.
     * @return Returns the String
     */
    @JsonGetter("suffix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSuffix() {
        return suffix;
    }

    /**
     * Setter for Suffix.
     * @param suffix Value for String
     */
    @JsonSetter("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Getter for Prefix.
     * @return Returns the String
     */
    @JsonGetter("prefix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrefix() {
        return prefix;
    }

    /**
     * Setter for Prefix.
     * @param prefix Value for String
     */
    @JsonSetter("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Converts this Name into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Name [" + "formattedName=" + formattedName + ", firstName=" + firstName
                + ", lastName=" + lastName + ", middleName=" + middleName + ", suffix=" + suffix
                + ", prefix=" + prefix + "]";
    }

    /**
     * Builds a new {@link Name.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Name.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(formattedName)
                .firstName(getFirstName())
                .lastName(getLastName())
                .middleName(getMiddleName())
                .suffix(getSuffix())
                .prefix(getPrefix());
        return builder;
    }

    /**
     * Class to build instances of {@link Name}.
     */
    public static class Builder {
        private String formattedName;
        private String firstName;
        private String lastName;
        private String middleName;
        private String suffix;
        private String prefix;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  formattedName  String value for formattedName.
         */
        public Builder(String formattedName) {
            this.formattedName = formattedName;
        }

        /**
         * Setter for formattedName.
         * @param  formattedName  String value for formattedName.
         * @return Builder
         */
        public Builder formattedName(String formattedName) {
            this.formattedName = formattedName;
            return this;
        }

        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for middleName.
         * @param  middleName  String value for middleName.
         * @return Builder
         */
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        /**
         * Setter for suffix.
         * @param  suffix  String value for suffix.
         * @return Builder
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * Setter for prefix.
         * @param  prefix  String value for prefix.
         * @return Builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Builds a new {@link Name} object using the set fields.
         * @return {@link Name}
         */
        public Name build() {
            return new Name(formattedName, firstName, lastName, middleName, suffix, prefix);
        }
    }
}
