package pt.projeto.batalhadereinos.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import pt.projeto.batalhadereinos.BatalhaDeReinos;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                // Resizable application, uses available space in browser
                //return new GwtApplicationConfiguration(true);
                // Fixed size application:
                return new GwtApplicationConfiguration(1440, 1024);
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new BatalhaDeReinos();
        }
}