package easyjobs.toptas.rssreader.di.component;

import dagger.Component;
import easyjobs.toptas.rssreader.di.module.FragmentModule;
import easyjobs.toptas.rssreader.rss.RssFragment;

/**
 * Created by faruktoptas on 29/01/17.
 */

@Component(modules = {FragmentModule.class})
public interface FragmentComponent {

    void inject(RssFragment obj);

}



