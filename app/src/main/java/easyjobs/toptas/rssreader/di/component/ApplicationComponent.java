package easyjobs.toptas.rssreader.di.component;

import javax.inject.Singleton;

import dagger.Component;
import easyjobs.toptas.rssreader.RssApplication;
import easyjobs.toptas.rssreader.di.module.ApplicationModule;

/**
 * Created by faruktoptas on 05/02/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(RssApplication rssApplication);

}
