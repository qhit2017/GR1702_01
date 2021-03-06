USE [db_conma]
GO
/****** Object:  Table [dbo].[表_1]    Script Date: 12/17/2017 18:59:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[表_1](
	[id] [nchar](10) NOT NULL,
	[name] [numeric](18, 0) NOT NULL,
	[salary] [nchar](10) NOT NULL,
	[departnent] [numeric](18, 0) NOT NULL,
	[recommend] [nchar](10) NOT NULL,
 CONSTRAINT [PK_表_1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
