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
                <NavLink to="flow">Flow</NavLink>
            </nav>

            <div className="p-m">
                <Outlet/>
            </div>
        </AppLayout>
    )
}