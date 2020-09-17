package com.java.order.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetail {
	
	@Id
	private String order_id;
	private String order_status;
	private String order_customer_id;
	private String order_item_name;
	private int order_item_qty;
	private double order_subtotal;
	private double order_tax;
	private double order_shipping_charges;
	private double order_total;
	private String order_payment_method;
	private Date order_payment_date;
	private Date order_created_date;
	private Date order_modified_date;
	private int order_payment_confirmation_number;
	private String order_billing_addressline1;
	private String order_billing_addressline2;
	private String order_billing_city;
	private String order_billing_state;
	private int order_billing_zip;
	private boolean order_instore_pickup;
	private boolean order_curbside_delivery;
	private boolean order_ship_to_home;
	private boolean order_third_party_delivery;
	private String order_shipping_addressline1;
	private String order_shipping_addressline2;
	private String order_shipping_city;
	private String order_shipping_state;
	private String order_shipping_zip;
	
	public OrderDetail () {
		order_id = UUID.randomUUID().toString();
	}

	public OrderDetail(String order_id, String order_status, String order_customer_id, String order_item_name,
			int order_item_qty, double order_subtotal, double order_tax, double order_shipping_charges,
			double order_total, String order_payment_method, Date order_payment_date, Date order_created_date,
			Date order_modified_date, int order_payment_confirmation_number, String order_billing_addressline1,
			String order_billing_addressline2, String order_billing_city, String order_billing_state,
			int order_billing_zip, boolean order_instore_pickup, boolean order_curbside_delivery,
			boolean order_ship_to_home, boolean order_third_party_delivery, String order_shipping_addressline1,
			String order_shipping_addressline2, String order_shipping_city, String order_shipping_state,
			String order_shipping_zip) {
		this.order_id = order_id;
		this.order_status = order_status;
		this.order_customer_id = order_customer_id;
		this.order_item_name = order_item_name;
		this.order_item_qty = order_item_qty;
		this.order_subtotal = order_subtotal;
		this.order_tax = order_tax;
		this.order_shipping_charges = order_shipping_charges;
		this.order_total = order_total;
		this.order_payment_method = order_payment_method;
		this.order_payment_date = order_payment_date;
		this.order_created_date = order_created_date;
		this.order_modified_date = order_modified_date;
		this.order_payment_confirmation_number = order_payment_confirmation_number;
		this.order_billing_addressline1 = order_billing_addressline1;
		this.order_billing_addressline2 = order_billing_addressline2;
		this.order_billing_city = order_billing_city;
		this.order_billing_state = order_billing_state;
		this.order_billing_zip = order_billing_zip;
		this.order_instore_pickup = order_instore_pickup;
		this.order_curbside_delivery = order_curbside_delivery;
		this.order_ship_to_home = order_ship_to_home;
		this.order_third_party_delivery = order_third_party_delivery;
		this.order_shipping_addressline1 = order_shipping_addressline1;
		this.order_shipping_addressline2 = order_shipping_addressline2;
		this.order_shipping_city = order_shipping_city;
		this.order_shipping_state = order_shipping_state;
		this.order_shipping_zip = order_shipping_zip;
	}

	/**
	 * @return the order_id
	 */
	public String getOrder_id() {
		return order_id;
	}

	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	/**
	 * @return the order_status
	 */
	public String getOrder_status() {
		return order_status;
	}

	/**
	 * @param order_status the order_status to set
	 */
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	/**
	 * @return the order_customer_id
	 */
	public String getOrder_customer_id() {
		return order_customer_id;
	}

	/**
	 * @param order_customer_id the order_customer_id to set
	 */
	public void setOrder_customer_id(String order_customer_id) {
		this.order_customer_id = order_customer_id;
	}

	/**
	 * @return the order_item_name
	 */
	public String getOrder_item_name() {
		return order_item_name;
	}

	/**
	 * @param order_item_name the order_item_name to set
	 */
	public void setOrder_item_name(String order_item_name) {
		this.order_item_name = order_item_name;
	}

	/**
	 * @return the order_item_qty
	 */
	public int getOrder_item_qty() {
		return order_item_qty;
	}

	/**
	 * @param order_item_qty the order_item_qty to set
	 */
	public void setOrder_item_qty(int order_item_qty) {
		this.order_item_qty = order_item_qty;
	}

	/**
	 * @return the order_subtotal
	 */
	public double getOrder_subtotal() {
		return order_subtotal;
	}

	/**
	 * @param order_subtotal the order_subtotal to set
	 */
	public void setOrder_subtotal(double order_subtotal) {
		this.order_subtotal = order_subtotal;
	}

	/**
	 * @return the order_tax
	 */
	public double getOrder_tax() {
		return order_tax;
	}

	/**
	 * @param order_tax the order_tax to set
	 */
	public void setOrder_tax(double order_tax) {
		this.order_tax = order_tax;
	}

	/**
	 * @return the order_shipping_charges
	 */
	public double getOrder_shipping_charges() {
		return order_shipping_charges;
	}

	/**
	 * @param order_shipping_charges the order_shipping_charges to set
	 */
	public void setOrder_shipping_charges(double order_shipping_charges) {
		this.order_shipping_charges = order_shipping_charges;
	}

	/**
	 * @return the order_total
	 */
	public double getOrder_total() {
		return order_total;
	}

	/**
	 * @param order_total the order_total to set
	 */
	public void setOrder_total(double order_total) {
		this.order_total = order_total;
	}

	/**
	 * @return the order_payment_method
	 */
	public String getOrder_payment_method() {
		return order_payment_method;
	}

	/**
	 * @param order_payment_method the order_payment_method to set
	 */
	public void setOrder_payment_method(String order_payment_method) {
		this.order_payment_method = order_payment_method;
	}

	/**
	 * @return the order_payment_date
	 */
	public Date getOrder_payment_date() {
		return order_payment_date;
	}

	/**
	 * @param order_payment_date the order_payment_date to set
	 */
	public void setOrder_payment_date(Date order_payment_date) {
		this.order_payment_date = order_payment_date;
	}

	/**
	 * @return the order_created_date
	 */
	public Date getOrder_created_date() {
		return order_created_date;
	}

	/**
	 * @param order_created_date the order_created_date to set
	 */
	public void setOrder_created_date(Date order_created_date) {
		this.order_created_date = order_created_date;
	}

	/**
	 * @return the order_modified_date
	 */
	public Date getOrder_modified_date() {
		return order_modified_date;
	}

	/**
	 * @param order_modified_date the order_modified_date to set
	 */
	public void setOrder_modified_date(Date order_modified_date) {
		this.order_modified_date = order_modified_date;
	}

	/**
	 * @return the order_payment_confirmation_number
	 */
	public int getOrder_payment_confirmation_number() {
		return order_payment_confirmation_number;
	}

	/**
	 * @param order_payment_confirmation_number the order_payment_confirmation_number to set
	 */
	public void setOrder_payment_confirmation_number(int order_payment_confirmation_number) {
		this.order_payment_confirmation_number = order_payment_confirmation_number;
	}

	/**
	 * @return the order_billing_addressline1
	 */
	public String getOrder_billing_addressline1() {
		return order_billing_addressline1;
	}

	/**
	 * @param order_billing_addressline1 the order_billing_addressline1 to set
	 */
	public void setOrder_billing_addressline1(String order_billing_addressline1) {
		this.order_billing_addressline1 = order_billing_addressline1;
	}

	/**
	 * @return the order_billing_addressline2
	 */
	public String getOrder_billing_addressline2() {
		return order_billing_addressline2;
	}

	/**
	 * @param order_billing_addressline2 the order_billing_addressline2 to set
	 */
	public void setOrder_billing_addressline2(String order_billing_addressline2) {
		this.order_billing_addressline2 = order_billing_addressline2;
	}

	/**
	 * @return the order_billing_city
	 */
	public String getOrder_billing_city() {
		return order_billing_city;
	}

	/**
	 * @param order_billing_city the order_billing_city to set
	 */
	public void setOrder_billing_city(String order_billing_city) {
		this.order_billing_city = order_billing_city;
	}

	/**
	 * @return the order_billing_state
	 */
	public String getOrder_billing_state() {
		return order_billing_state;
	}

	/**
	 * @param order_billing_state the order_billing_state to set
	 */
	public void setOrder_billing_state(String order_billing_state) {
		this.order_billing_state = order_billing_state;
	}

	/**
	 * @return the order_billing_zip
	 */
	public int getOrder_billing_zip() {
		return order_billing_zip;
	}

	/**
	 * @param order_billing_zip the order_billing_zip to set
	 */
	public void setOrder_billing_zip(int order_billing_zip) {
		this.order_billing_zip = order_billing_zip;
	}

	/**
	 * @return the order_instore_pickup
	 */
	public boolean isOrder_instore_pickup() {
		return order_instore_pickup;
	}

	/**
	 * @param order_instore_pickup the order_instore_pickup to set
	 */
	public void setOrder_instore_pickup(boolean order_instore_pickup) {
		this.order_instore_pickup = order_instore_pickup;
	}

	/**
	 * @return the order_curbside_delivery
	 */
	public boolean isOrder_curbside_delivery() {
		return order_curbside_delivery;
	}

	/**
	 * @param order_curbside_delivery the order_curbside_delivery to set
	 */
	public void setOrder_curbside_delivery(boolean order_curbside_delivery) {
		this.order_curbside_delivery = order_curbside_delivery;
	}

	/**
	 * @return the order_ship_to_home
	 */
	public boolean isOrder_ship_to_home() {
		return order_ship_to_home;
	}

	/**
	 * @param order_ship_to_home the order_ship_to_home to set
	 */
	public void setOrder_ship_to_home(boolean order_ship_to_home) {
		this.order_ship_to_home = order_ship_to_home;
	}

	/**
	 * @return the order_third_party_delivery
	 */
	public boolean isOrder_third_party_delivery() {
		return order_third_party_delivery;
	}

	/**
	 * @param order_third_party_delivery the order_third_party_delivery to set
	 */
	public void setOrder_third_party_delivery(boolean order_third_party_delivery) {
		this.order_third_party_delivery = order_third_party_delivery;
	}

	/**
	 * @return the order_shipping_addressline1
	 */
	public String getOrder_shipping_addressline1() {
		return order_shipping_addressline1;
	}

	/**
	 * @param order_shipping_addressline1 the order_shipping_addressline1 to set
	 */
	public void setOrder_shipping_addressline1(String order_shipping_addressline1) {
		this.order_shipping_addressline1 = order_shipping_addressline1;
	}

	/**
	 * @return the order_shipping_addressline2
	 */
	public String getOrder_shipping_addressline2() {
		return order_shipping_addressline2;
	}

	/**
	 * @param order_shipping_addressline2 the order_shipping_addressline2 to set
	 */
	public void setOrder_shipping_addressline2(String order_shipping_addressline2) {
		this.order_shipping_addressline2 = order_shipping_addressline2;
	}

	/**
	 * @return the order_shipping_city
	 */
	public String getOrder_shipping_city() {
		return order_shipping_city;
	}

	/**
	 * @param order_shipping_city the order_shipping_city to set
	 */
	public void setOrder_shipping_city(String order_shipping_city) {
		this.order_shipping_city = order_shipping_city;
	}

	/**
	 * @return the order_shipping_state
	 */
	public String getOrder_shipping_state() {
		return order_shipping_state;
	}

	/**
	 * @param order_shipping_state the order_shipping_state to set
	 */
	public void setOrder_shipping_state(String order_shipping_state) {
		this.order_shipping_state = order_shipping_state;
	}

	/**
	 * @return the order_shipping_zip
	 */
	public String getOrder_shipping_zip() {
		return order_shipping_zip;
	}

	/**
	 * @param order_shipping_zip the order_shipping_zip to set
	 */
	public void setOrder_shipping_zip(String order_shipping_zip) {
		this.order_shipping_zip = order_shipping_zip;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_status=" + order_status + ", order_customer_id="
				+ order_customer_id + ", order_item_name=" + order_item_name + ", order_item_qty=" + order_item_qty
				+ ", order_subtotal=" + order_subtotal + ", order_tax=" + order_tax + ", order_shipping_charges="
				+ order_shipping_charges + ", order_total=" + order_total + ", order_payment_method="
				+ order_payment_method + ", order_payment_date=" + order_payment_date + ", order_created_date="
				+ order_created_date + ", order_modified_date=" + order_modified_date
				+ ", order_payment_confirmation_number=" + order_payment_confirmation_number
				+ ", order_billing_addressline1=" + order_billing_addressline1 + ", order_billing_addressline2="
				+ order_billing_addressline2 + ", order_billing_city=" + order_billing_city + ", order_billing_state="
				+ order_billing_state + ", order_billing_zip=" + order_billing_zip + ", order_instore_pickup="
				+ order_instore_pickup + ", order_curbside_delivery=" + order_curbside_delivery
				+ ", order_ship_to_home=" + order_ship_to_home + ", order_third_party_delivery="
				+ order_third_party_delivery + ", order_shipping_addressline1=" + order_shipping_addressline1
				+ ", order_shipping_addressline2=" + order_shipping_addressline2 + ", order_shipping_city="
				+ order_shipping_city + ", order_shipping_state=" + order_shipping_state + ", order_shipping_zip="
				+ order_shipping_zip + "]";
	}
	
	
	
	
}
