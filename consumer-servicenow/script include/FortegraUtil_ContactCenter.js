/*
Javascript proxy for the midserver java library
*/

var FortegraUtilContactCenter = Class.create();

FortegraUtilContactCenter.prototype = {

    initialize: function() {
        this.CCRepo = Packages.au.com.jarfusion.eightbyeight.contactcenter.EightbyEightContactCenterRepository;
    },

    download8x8File: function() {
        this.requestBody = probe.getParameter("requestBody");
        var pgpObj = new this.CCRepo("test").download8x8File(this.requestBody);
        return pgpObj;
    },

    type: FortegraUtilContactCenter
};