class ThemeConfig {
    constructor() {
        if (ThemeConfig.instance) {
            return ThemeConfig.instance;
        }
        this.settings = {
            darkMode: true,
            primaryColor: "#3498db",
            fontSize: "16px"
        };
        ThemeConfig.instance = this;
    }

    getSetting(key) {
        return this.settings[key];
    }
}

const instance = new ThemeConfig();
Object.freeze(instance);
export default instance;