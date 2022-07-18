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
 * This is a model class for Org type.
 */
public class Org {
    private String company;
    private String department;
    private String title;

    /**
     * Default constructor.
     */
    public Org() {
    }

    /**
     * Initialization constructor.
     * @param  company  String value for company.
     * @param  department  String value for department.
     * @param  title  String value for title.
     */
    public Org(
            String company,
            String department,
            String title) {
        this.company = company;
        this.department = department;
        this.title = title;
    }

    /**
     * Getter for Company.
     * Name of the contact's company.
     * @return Returns the String
     */
    @JsonGetter("company")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompany() {
        return company;
    }

    /**
     * Setter for Company.
     * Name of the contact's company.
     * @param company Value for String
     */
    @JsonSetter("company")
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Getter for Department.
     * Name of the contact's department.
     * @return Returns the String
     */
    @JsonGetter("department")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDepartment() {
        return department;
    }

    /**
     * Setter for Department.
     * Name of the contact's department.
     * @param department Value for String
     */
    @JsonSetter("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Getter for Title.
     * Contact's business title.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * Contact's business title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Converts this Org into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Org [" + "company=" + company + ", department=" + department + ", title=" + title
                + "]";
    }

    /**
     * Builds a new {@link Org.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Org.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .company(getCompany())
                .department(getDepartment())
                .title(getTitle());
        return builder;
    }

    /**
     * Class to build instances of {@link Org}.
     */
    public static class Builder {
        private String company;
        private String department;
        private String title;



        /**
         * Setter for company.
         * @param  company  String value for company.
         * @return Builder
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * Setter for department.
         * @param  department  String value for department.
         * @return Builder
         */
        public Builder department(String department) {
            this.department = department;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Builds a new {@link Org} object using the set fields.
         * @return {@link Org}
         */
        public Org build() {
            return new Org(company, department, title);
        }
    }
}
