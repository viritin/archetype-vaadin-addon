#set($weirdPackage = $package.replaceAll("[.]", "_"))
window.${weirdPackage}_jsexample_MyJavaScriptComponent = function() {
    // Create basic input element
    var el = document.createElement("input");
    // Create basic button element
    var btn = document.createElement("button");
    btn.innerHTML = "sync";

    // add elements to the root div of JS composition
    this.getElement().appendChild(el);
    this.getElement().appendChild(btn);

    // Handle changes from the server-side
    this.onStateChange = function() {
        el.value = this.getState().value;
    };

    // Pass textfield value to the server-side when button clicked
    var connetor = this;
    btn.onclick = function() {
        connetor.onClick(el.value);
    };
};
