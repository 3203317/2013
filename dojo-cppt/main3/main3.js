/**
 * 作者：黄鑫
 * 日期：2013-1-1
 * 描述：主框架
 */
require(["dojo/ready",
	"dojo/dom",
	"capec/frame/TabTree",
	"capec/utils/ajax",
	"dijit/layout/BorderContainer",
	"dojo/_base/connect",
	"dijit/layout/ContentPane",
	"dojox/layout/ToggleSplitter",
    "dojox/layout/ContentPane",
	"dijit/layout/BorderContainer"], function($ready, $dom, $Word, $ajax) {

	setTimeout(function() {
		new $Word({
			menuSource : "testData/module.json",
			offenSource: "testData/omodule.json",
			logoutSource: "testData/logout.json",
			defaultPage : "welcome.html",
			logoutPage: "login.html",
			topPage: "top.html"
		}, "_main");
	},100);

	$ready(function() {
		$dom.byId("_main_loader").children[0].innerHTML += " done.";
		setTimeout(function() {
			dojo.fadeOut({
				node : "_main_loader",
				duration : 500,
				onEnd : function($n) { $n.style.display = "none"; }
			}).play();
		}, 250);
	});
});