/*
Javascript proxy for the midserver java library
*/
var FortegraUtil_ContactCenter = Class.create();

FortegraUtil_ContactCenter.prototype = {

    initialize: function() {
        this.CCRepo = Packages.au.com.jarfusion.eightbyeight.contactcenter.EightbyEightContactCenterRepository;
    },

    download8x8File: function() {
        this.objectid = probe.getParameter("objectid");
        this.authtoken = probe.getParameter("authtoken");
        this.odate = probe.getParameter("odate");
        var pgpObj = new this.CCRepo("test").download8x8File(this.objectid,
         this.authtoken,this.odate);
        return pgpObj;
    },

    type: FortegraUtil
};