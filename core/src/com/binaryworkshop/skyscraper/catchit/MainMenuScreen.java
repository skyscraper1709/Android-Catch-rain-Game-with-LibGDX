package com.binaryworkshop.skyscraper.catchit;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * Created by S4f4t on 3/5/2015.
 */
public class MainMenuScreen implements Screen {

  final MyGdxCatchItGame game;
  OrthographicCamera camera;

    public MainMenuScreen(final MyGdxCatchItGame rcvdGame){
        game=rcvdGame;
        camera =new OrthographicCamera();
        camera.setToOrtho(false, 800,480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0,0,0.2f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch,"Welcome to Rain Bucket!!!", 100,150);
        game.font.draw(game.batch,"Tap Anywhere to begin!",100,100);
        game.batch.end();

        if(Gdx.input.isTouched()){
            game.setScreen(new GameScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
