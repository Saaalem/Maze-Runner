package game.controller;

import java.awt.Graphics;

import game.worlds.World;

public class GameState extends State {
	
	private World world;
	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
	}
	
	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
