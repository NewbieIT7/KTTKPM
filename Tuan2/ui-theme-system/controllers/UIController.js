import ButtonFactory from '../factories/ButtonFactory.js';

class UIController {
    renderComponent(type) {
        try {
            const button = ButtonFactory.createButton(type);
            const output = button.render();
            console.log(`[VIEW OUTPUT]: ${output}`);
        } catch (error) {
            console.error(`[CONTROLLER ERROR]: ${error.message}`);
        }
    }
}

export default UIController;