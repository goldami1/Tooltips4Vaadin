import tippy from 'tippy.js';

window.tooltips = {
		/* Util */
		getElement: function(classname) {
			return document.querySelector('.' + classname);
		},
		
		setTooltip: function (classname, tooltip){
			const tooltipElement = window.tooltips.getElement(classname);
			if(tooltipElement) tippy(tooltipElement, {
				content: tooltip
			});
			return tooltipElement._tippy.id;
		},
		
		updateTooltip: function(classname, tooltip){
			const tooltipElement = window.tooltips.getElement(classname);
			if(tooltipElement) tooltipElement._tippy.setContent(tooltip);
		},
		
		removeTooltip: function(classname, tooltipId){
			const tooltipElement = window.tooltips.getElement(classname);
			if(tooltipElement) tooltipElement._tippy.destroy();
			
			/* tippy fails to remove tooltips whose registered component 
			   gets removed during the open animation */
			const lostTooltip = document.getElementById('tippy-' + tooltipId);
			if(lostTooltip) lostTooltip._tippy.destroy();
		}
}