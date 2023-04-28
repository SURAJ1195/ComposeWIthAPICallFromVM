package com.example.irctconbordingstatus.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("aadharrefno")
    val aadharrefno: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("agent_id")
    val agentId: String,
    @SerializedName("cityid")
    val cityid: String,
    @SerializedName("companyname")
    val companyname: String,
    @SerializedName("contractbegindate")
    val contractbegindate: String,
    @SerializedName("contractenddate")
    val contractenddate: String,
    @SerializedName("countryid")
    val countryid: String,
    @SerializedName("createddate")
    val createddate: String,
    @SerializedName("dateofbirth")
    val dateofbirth: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("faxnumber")
    val faxnumber: String,
    @SerializedName("firstname")
    val firstname: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("ippb_agentid")
    val ippbAgentid: String,
    @SerializedName("lastname")
    val lastname: String,
    @SerializedName("middlename")
    val middlename: String,
    @SerializedName("mobilenumber")
    val mobilenumber: String,
    @SerializedName("offcountryid")
    val offcountryid: String,
    @SerializedName("offdistrict")
    val offdistrict: String,
    @SerializedName("offotherdistrict")
    val offotherdistrict: String,
    @SerializedName("offotherstate")
    val offotherstate: String,
    @SerializedName("offphonenumber")
    val offphonenumber: String,
    @SerializedName("offpincode")
    val offpincode: String,
    @SerializedName("offpostoffice")
    val offpostoffice: String,
    @SerializedName("offstate")
    val offstate: String,
    @SerializedName("offstreet")
    val offstreet: String,
    @SerializedName("othercity")
    val othercity: String,
    @SerializedName("otherstate")
    val otherstate: String,
    @SerializedName("pancardnumber")
    val pancardnumber: String,
    @SerializedName("param_a")
    val paramA: Any,
    @SerializedName("param_b")
    val paramB: Any,
    @SerializedName("param_c")
    val paramC: Any,
    @SerializedName("pincode")
    val pincode: String,
    @SerializedName("postoffice")
    val postoffice: String,
    @SerializedName("stateid")
    val stateid: String,
    @SerializedName("updateddate")
    val updateddate: String
)