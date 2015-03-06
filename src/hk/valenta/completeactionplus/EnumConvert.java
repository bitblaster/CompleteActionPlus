package hk.valenta.completeactionplus;

public class EnumConvert {

	public static final int themeIndex(String themeName) {
		if (themeName.equals("Dark")) return 1;
		else return 0;
	}
	
	public static final String themeName(int index) {
		if (index == 1) return "Dark";
		else return "Light";
	}	
	
	public static final int layouThemeIndex(String themeName) {
		if (themeName.equals("Dark")) return 2;
		else if (themeName.equals("Light")) return 1;
		else if (themeName.equals("Transparent")) return 3;
		else return 0;
	}
	
	public static final String layoutThemeName(int index) {
		if (index == 2) return "Dark";
		else if (index == 1) return "Light";
		else if (index == 3) return "Transparent";
		else return "Default";
	}	
	
	public static final int layoutIndex(String configName) {
		if (configName.equals("List")) return 1;
		else if (configName.equals("Grid")) return 2;
		else return 0;
	}
	
	public static final String layoutName(int index) {
		switch (index) {
		case 1:
			return "List";
		case 2:
			return "Grid";
		default:
			return "Default";
		}
	}
	
	public static final int listTextSizeIndex(String configName) {
		if (configName.equals("Regular")) return 0;
		else if (configName.equals("Large")) return 1;
		else if (configName.equals("Extra Large")) return 2;
		else return 0;
	}
	
	public static final String listTextSizeName(int index) {
		switch (index) {
		case 1:
			return "Large";
		case 2:
			return "Extra Large";
		default:
			return "Regular";
		}
	}	
	
	public static final int gridTextSizeIndex(String configName) {
		if (configName.equals("Hidden")) return 0;
		else if (configName.equals("Tiny")) return 1;
		else if (configName.equals("Small")) return 2;
		else if (configName.equals("Regular")) return 3;
		else return 3;
	}
	
	public static final String gridTextSizeName(int index) {
		switch (index) {
		case 0:
			return "Hidden";
		case 1:
			return "Tiny";
		case 2:
			return "Small";
		default:
			return "Regular";
		}
	}	
	
	public static final String positionName(int index) {
		switch (index) {
		case 1:
			return "Bottom";
		case 2:
			return "BottomRight";
		case 3:
			return "Right";
		case 4:
			return "TopRight";
		case 5:
			return "Top";
		case 6:
			return "TopLeft";
		case 7:
			return "Left";
		case 8:
			return "BottomLeft";
		default:
			return "Center";
		}
	}
	
	public static final int positionIndex(String name) {
		if (name.equals("Bottom")) return 1;
		else if (name.equals("BottomRight")) return 2;
		else if (name.equals("Right")) return 3;
		else if (name.equals("TopRight")) return 4;
		else if (name.equals("Top")) return 5;
		else if (name.equals("TopLeft")) return 6;
		else if (name.equals("Left")) return 7;
		else if (name.equals("BottomLeft")) return 8;
		else return 0;
	}

	public static final String manageTriggerName(int index) {
		switch (index) {
		case 1:
			return "Title";
		default:
			return "Wrench";
		}
	}
	
	public static final int manageTriggerIndex(String name) {
		if (name.equals("Title")) return 1;
		else return 0;
	}	
	
	public static final String longPressName(int index) {
		switch (index) {
		case 1:
			return "AppInfo";
		case 2:
			return "Default";
		case 3:
			return "XHalo";
		case 4:
			return "Launch";
		case 5:
			return "TempDefault";
		default:
			return "Nothing";
		}
	}
	
	public static final int longPressIndex(String name) {
		if (name.equals("AppInfo")) return 1;
		else if (name.equals("Default")) return 2;
		else if (name.equals("XHalo")) return 3;
		else if (name.equals("Launch")) return 4;
		else if (name.equals("TempDefault")) return 5;
		else return 0;
	}
	
	public static final String iconSizeName(int index) {
		switch (index) {
		case 1:
			return "24";
		case 2:
			return "36";
		case 3:
			return "48";
		case 4:
			return "64";
		case 5:
			return "72";
		default:
			return "Default";
		}
	}
	
	public static final int iconSizeIndex(String name) {
		if (name.equals("24")) return 1;
		else if (name.equals("36")) return 2;
		else if (name.equals("48")) return 3;
		else if (name.equals("64")) return 4;
		else if (name.equals("72")) return 5;
		else return 0;
	}
}
