/*
Action name: Util-8x8-DownloadFile
Application: Global
input: Objectid, authtoken, odate (for storing into azure blobstorage)
*/

var probe = new JavascriptProbe(inputs.midservername);
probe.setName("8x8_Download8x8File");
probe.setJavascript("var pdf = new FortegraUtil_ContactCenter(); res = pdf.Download8x8File();");
probe.addParameter("objectid", inputs.objectid );
probe.addParameter("authtoken", inputs.authtoken );
probe.addParameter("odate", inputs.odate );
var strOutputEccId = probe.create();
outputs.resp_payload = strOutputEccId;