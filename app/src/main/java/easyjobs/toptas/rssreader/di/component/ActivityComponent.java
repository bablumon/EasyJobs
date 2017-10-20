package easyjobs.toptas.rssreader.di.component;

import javax.inject.Singleton;

import dagger.Component;
import easyjobs.toptas.rssreader.di.module.ActivityModule;
import easyjobs.toptas.rssreader.main.MainActivity;

@Singleton
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity obj);

}