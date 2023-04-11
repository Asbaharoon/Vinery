package satisfyu.vinery.client.render.entity;

import satisfyu.vinery.VineryIdentifier;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.WanderingTraderEntityRenderer;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.util.Identifier;

public class WanderingWinemakerRenderer extends WanderingTraderEntityRenderer {
	private static final Identifier TEXTURE = new VineryIdentifier("textures/entity/wandering_winemaker.png");
	
	public WanderingWinemakerRenderer(EntityRendererFactory.Context context) {
		super(context);
	}
	
	@Override
	public Identifier getTexture(WanderingTraderEntity entity) {
		return TEXTURE;
	}
}