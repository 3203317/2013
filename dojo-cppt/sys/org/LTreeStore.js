/**
 * 作者：黄鑫
 * 日期：2013-04-01
 * 描述：组织机构树Store
 */
define(["dojo/data/ItemFileWriteStore",
	"dojo/_base/declare",
	"dojo/_base/connect",
	"dojo/_base/lang",
	"capec/utils/toTreeObj",
    "capec/utils/ajax"], function($ItemFileWriteStore,$declare,$connect,$lang,$toTreeObj,$ajax){
	return $declare("internal/sys/org/LTreeStore", null,{
		vpath: "",
		_tree: null,
		_store: null,
		bindTree: function($tree){
			this._tree = $tree;
			this._loadData();
		},
		constructor: function(){
			this.inherited(arguments);
			if(arguments[0].vpath) this.vpath = arguments[0].vpath;
		},
		_loadData: function(){
			$ajax({
				async : true,
				url : this.vpath +"testData/org.json",
				callback : $lang.hitch(this, "_onDataLoaded")
			});
		},
		_onDataLoaded: function($data){
			var __items = $toTreeObj($data,0,{
				identifier: "id",
				fidentifier: "p_id",
				label: "orgname"
			}).children;

			this._store = new $ItemFileWriteStore({
				data: {
					identifier: "id",
					label: "orgname",
					items: __items == undefined ? [] : __items
				}
			});

			this._tree.setStore(this._store);
		},
		_onError: function(){
			console.log(arguments);
		}
	})
});