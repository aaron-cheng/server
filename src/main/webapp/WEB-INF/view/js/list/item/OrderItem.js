/*jslint browser: true, devel: true, indent: 4, nomen:true, vars: true */
/*global define */

define(function (require, exports, module) {
    "use strict";

    var Tr = require('./Tr');
    var _ = require('../../lib/underscore');
    
    var OrderItem = Tr.extend({
        
        tmpl: require('./OrderItem.handlebars'),

        events: {
            'click .btn-print': 'onPrint'
        },

        getRenderData: function () {
            var data = Tr.prototype.getRenderData.apply(this, arguments);
            data.createdTime = require('../../util/StringUtils').formatDate(data.createdTime);
            data.payed = data.status === 1;
            return data;
        },

        
        /* -------------------- Event Listener ----------------------- */
        
        onPrint: function (evt) {
            evt.preventDefault();
            this.trigger('print', this.model);
            evt.stopPropagation();
        }
        
    });
    
    return OrderItem;
    
});

