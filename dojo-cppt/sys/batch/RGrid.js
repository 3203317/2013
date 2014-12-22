/**
 * 作者：黄鑫
 * 日期：2013-03-07
 * 描述：批次Grid
 */
define(["dojo/_base/declare",
	"dojo/data/ItemFileReadStore",
	"dojo/_base/connect",
	"dojo/data/ItemFileWriteStore",
	"dojox/grid/EnhancedGrid",
	"dojo/_base/lang",
	"dijit/layout/ContentPane",
	"dojox/grid/_CheckBoxSelector",
	"dojox/grid/enhanced/plugins/Pagination"], function($declare, $ItemFileReadStore, $connect,$ItemFileWriteStore,$EnhancedGrid, $lang, $ContentPane) {
	return $declare($ContentPane, {
		_store: null,
		_dialog: null,
		_editDialog: null,
		_toolbar: null,
		bindStore: function($store){
			this._store = $store;
			this._store.bindGrid(this);
		},
		bindDialog: function($dialog){
			this._dialog = $dialog;
			this._dialog.bindGrid(this);
		},
		bindEditDialog: function($value){
			this._editDialog = $value;
			this._editDialog.bindGrid(this);
		},
		bindToolbar: function($toolbar){
			this._toolbar = $toolbar;
		},
		_onDblClickItem: function(){
			if(this._grid.selection.getSelectedCount() == 1) this._editDialog.show({ model: "Update" });
		},
		_onSelectedItem: function(){
			this._toolbar.disableEdit(this._grid.selection.getSelectedCount() != 1);
			this._toolbar.disableDel(this._grid.selection.getSelectedCount() == 0);
		},
		postCreate : function() {
			this.inherited(arguments);
			this._addGrid();
		},
		startup:function(){
			this.inherited(arguments);
			this._grid.startup();
			this._addEvents();
		},
		_removeHandles: function(){
			if(this._connect1 != null) this._connect1.remove();
			if(this._connect2 != null) this._connect2.remove();
			if(this._connect3 != null) this._connect3.remove();
		},
		_addGrid: function(){
			this._grid = new $EnhancedGrid({
				style: { height: "100%", margin: 0, padding: 0 ,width:"100%"},
				structure: [{
					type: "dojox.grid._CheckBoxSelector"
				}, {
					cells: [{ name: "编号", field: "id", width: "50px" }],
					noscroll: true
				}, [
					{ name: "批次名称", field: "batchname", width: "100px" },
					{ name: "批次信息", field: "info", width: "100px" },
					{ name: "批次状态", field: "status", width: "100px" },
					{ name: "开始时间", field: "begindate", width: "120px" },
					{ name: "结束时间", field: "enddate", width: "120px" },
					{ name: "批次UUID", field: "uuid", width: "100px" },
					{ name: "用户单位", field: "userunit", width: "100px" },
					{ name: "创建时间", field: "createdate", width: "120px" },
					{ name: "创建人", field: "createuser", width: "80px" },
					{ name: "版本号", field: "ver" }
					]
				],
				plugins: {
					pagination: {
						pageSizes: [10, 25, 30, 50, 100, Infinity],
						description: true,
						sizeSwitch: true,
						pageStepper: true,
						gotoButton: true,
						maxPageStep: 10,
						position: "bottom",
						defaultPage: 1,
						defaultPageSize: 25
					}
				}
			},document.createElement("div"));
			this.domNode.appendChild(this._grid.domNode);
		},
		_addEvents: function(){
			this._connect1 = $connect.connect(this._grid, "onSelected", this, "_onSelectedItem");
			this._connect2 = $connect.connect(this._grid, "onDeselected", this, "_onSelectedItem");
			this._connect3 = $connect.connect(this._grid, "onDblClick", this, "_onDblClickItem");
		},
		getSelectItem: function(){
			var __items = this._grid.selection.getSelected();
			return __items.length == 1 ? __items[0] : null;
		},
		getSelectItemIds: function(){
			var __selItems = this._grid.selection.getSelected();
			var __ids = [];
			if(__selItems.length > 0){
				dojo.forEach(__selItems, function($item){
					__ids.push($item.i.id-0);
				});
			}
			return __ids.join(",");
		},
		setStore: function($store){
			this._grid.selection.clear();
			this._grid.setStore($store);
		},
		setQuery: function($params){
			this._grid.setQuery($params);
		},
		refresh: function(){
			this._grid._refresh();
		},
		destroy: function(){
			this._removeHandles();
			this.destroyDescendants();
			this.inherited(arguments);
		}
	});
});