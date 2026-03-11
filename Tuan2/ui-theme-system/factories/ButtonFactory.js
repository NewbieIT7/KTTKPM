import { PrimaryButton, DangerButton, GhostButton } from '../models/Buttons.js';
import theme from '../models/ThemeConfig.js';

class ButtonFactory {
    static createButton(type) {
        const mode = theme.getSetting('darkMode') ? "Dark Mode" : "Light Mode";
        console.log(`--- Factory: Đang tạo nút cho chế độ ${mode} ---`);

        switch (type.toLowerCase()) {
            case 'primary': return new PrimaryButton();
            case 'danger': return new DangerButton();
            case 'ghost': return new GhostButton();
            default: throw new Error("Loại nút không hợp lệ!");
        }
    }
}

export default ButtonFactory;