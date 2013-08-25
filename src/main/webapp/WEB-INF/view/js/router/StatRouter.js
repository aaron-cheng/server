/*jslint browser: true, devel: true, indent: 4, nomen:true, vars: true */
/*global define */

define(function (require, exports, module) {
    "use strict";

    var BaseRouter = require('./BaseRouter');

    var StatRouter = BaseRouter.extend({
        routes: {
            '': 'showOrder',
            'order': 'showOrder',
            'stat': 'showStat',
            'dish-stat': 'showDishStat'
        },

        showOrder: function () {
            this.page.trigger('showOrder');
        },

        showDishStat: function () {
            this.page.trigger('showDishStat');
        },

        showStat: function () {
            this.page.trigger('showStat');
        }
    });
    
    return StatRouter;
    
});

