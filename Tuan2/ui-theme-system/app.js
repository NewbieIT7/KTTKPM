import UIController from './controllers/UIController.js';

const controller = new UIController();

console.log("=== HỆ THỐNG QUẢN LÝ GIAO DIỆN (UI SYSTEM) ===");

controller.renderComponent('primary');
console.log("-----------------------");
controller.renderComponent('danger');
console.log("-----------------------");
controller.renderComponent('ghost');