/*jslint browser: true, devel: true, indent: 4, nomen:true, vars: true */
/*global define */

define(function (require, exports, module) {
    "use strict";

    var BaseForm = require('./BaseForm');

    var Text = require('./item/Text');
    var Required = require('./validator/Required');

    var LoginForm = BaseForm.extend({
        url: '/api/login',

        itemConfig: [{
            type: Text,
            el: '.input-name',
            validators: [{
                type: Required,
                errorMessage: '用户名不能为空'
            }]
        }, {
            type: Text,
            el: '.input-password',
            validators: [{
                type: Required,
                errorMessage: '密码不能为空'
            }]
        }]
    });

    return LoginForm;
});
