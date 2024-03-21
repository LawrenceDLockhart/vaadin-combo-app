import {NavLink, Outlet} from "react-router-dom";
import {AppLayout, DrawerToggle} from "@vaadin/react-components";

export default function MainLayout() {
    return (
        <AppLayout>
            <div slot="navbar" className="flex gap-s items-center">
                <DrawerToggle/>
                <h2>Vaadin Demo</h2>
            </div>

            <nav slot="drawer" className="p-m flex flex-col gap-m">
                <NavLink to="/">Home</NavLink>

                <h3 className="text-l mt-l">Flow</h3>
                <NavLink to="flow-components">Components</NavLink>
                <NavLink to="flow-layouts">Layouts</NavLink>
                <NavLink to="flow-events">Events</NavLink>
                <NavLink to="flow-grid">Grid</NavLink>
                <NavLink to="flow-form">Form</NavLink>
                <NavLink to="flow-push">Push</NavLink>

                <h3 className="text-l mt-l">Hilla</h3>
                <NavLink to="hilla-components">Components</NavLink>
            </nav>

            <div className="p-m">
                <Outlet/>
            </div>
        </AppLayout>
    )
}