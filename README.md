# Tooltips4Vaadin
This plugin allows you to define proper tooltips.

![Tooltip demo did not load.](https://gitlab.com/gsedlacz/tooltips4vaadin/raw/master/misc/demo.png "Tooltip demo")

## Official Download
[Vaadin Directory](https://vaadin.com/directory/component/tooltips4vaadin)

## Requirements
1. Java 1.8
2. Vaadin Flow version: 14+
3. npm based build

## Usage

### Set / update a tooltip
```
Tooltips.getCurrent().setTooltip(yourComponent, "an important information")
```
### Remove a tooltip
```
Tooltips.getCurrent().removeTooltip(yourComponent)
``` 

## Browser Compatibilty
This library should work nicely with any modern browser but only the ones shown on the were tested.

## Credit
This plugin makes use of these libraries:
1. tippy.js (license: MIT, version. 4.3.4, URL: https://github.com/atomiks/tippyjs)
2. Project Lombok (license: MIT, version 1.18.8, URL: https://projectlombok.org/)

## Copyright and license
Code and documentation copyright 2019 Gerrit Sedlaczek, @goldami1.
  
Code and documentation released under Apache 2.0 license.

## Updated MVN CDN
https://cdn.jsdelivr.net/gh/goldami1/Tooltips4Vaadin@mvn-repo/