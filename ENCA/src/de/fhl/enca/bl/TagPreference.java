package de.fhl.enca.bl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javafx.scene.paint.Color;

/**
 * Class TagPreference
 * This class contains metadata for tags. It can be stored and read out of
 * a file.
 * 
 * @author Haoze Zhang
 * @version 2016-05-30
 */
public class TagPreference implements Serializable {
	
	private double H = 0.207;
	private double S = 0.55;
	private double[] L = {0.45, 0.65, 0.85};

	private static final long serialVersionUID = -633570705543638913L;
	private Map<TagType, InternationalString> descripsions = new HashMap<TagType, InternationalString>();
	//transient private Map<TagType, Color> colors = null;

	public TagPreference() {
//		colors = new HashMap<TagType, Color>();
//		colors.put(TagType.ROOM, Color.hsb(H, S, L[0]));
//		colors.put(TagType.ITEM, Color.hsb(H, S, L[1]));
//		colors.put(TagType.OTHERS, Color.hsb(H, S, L[2]));

		InternationalString desROOM = new InternationalString();
		desROOM.setString(LanguageType.CHINESE, "房间");
		desROOM.setString(LanguageType.ENGLISH, "Room");
		desROOM.setString(LanguageType.GERMAN, "Zimmer");
		
		InternationalString desITEM = new InternationalString();
		desITEM.setString(LanguageType.CHINESE, "物品");
		desITEM.setString(LanguageType.ENGLISH, "Item");
		desITEM.setString(LanguageType.GERMAN, "Artikel");
		
		InternationalString desOTHERS = new InternationalString();
		desOTHERS.setString(LanguageType.CHINESE, "其它");
		desOTHERS.setString(LanguageType.ENGLISH, "Others");
		desOTHERS.setString(LanguageType.GERMAN, "Andere");
		
		descripsions.put(TagType.ROOM, desROOM);
		descripsions.put(TagType.ITEM, desITEM);
		descripsions.put(TagType.OTHERS, desOTHERS);
	};

	/* Getters */
	public Color getColors(TagType t) {
		return Color.hsb(H, S, L[t.getId()]);
	}

	public InternationalString getDescripsions(TagType t) {
		return descripsions.get(t);
	}

	/* Setters */
	public void setColors(Map<TagType, Color> colors) {
//		this.colors = colors;
	}

	public void setDescripsions(Map<TagType, InternationalString> descripsions) {
		this.descripsions = descripsions;
	}
}