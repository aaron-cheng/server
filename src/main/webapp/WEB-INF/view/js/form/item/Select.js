/*jslint browser: true, devel: true, indent: 4, nomen:true, vars: true */
/*global define */

define(function (require, exports, module) {
    "use strict";

    var BaseItem = require('./BaseItem');

    var Select = BaseItem.extend({
        valueEl: 'select'
    });

    return Select;
});

